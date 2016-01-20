//
//  main.c
//  data finish
//
//  Created by 임동준 on 2016. 1. 20..
//  Copyright © 2016년 임동준. All rights reserved.
//
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct node node_t;
typedef struct tree tree_t;
void insertionFix(tree_t* tree, node_t* insertNode);
void leftRotate(tree_t* tree, node_t* target);
void rightRotate(tree_t* tree, node_t* target);
void insertion(tree_t* tree, node_t* newNode);
void deleteFixup(tree_t* tree, node_t* fixupNode);
#define MAX_NUM 100

//node 구조체
struct node {
    node_t* parent;
    int color; //red:1 black:0
    node_t* left;
    node_t* right;
    int data;
};


//tree 구조체
struct tree{
    node_t* root;
    node_t* NIL;
};

void leftRotate(tree_t* tree, node_t* target){
    
    node_t* sub = tree->NIL;
    
    if(target == tree->root) return;
    if(!target) return;
    
    sub = target->right;
    target->right = sub->left;
    if(target->right != tree->NIL){
        target->right->parent = target;
    }
    if(target->parent == tree->NIL){
        tree -> root = sub;
    } else if(target->parent ->left == target){
        target->parent->left = sub;
    } else {
        target->parent -> right = sub;
    }
    sub->parent = target->parent;
    sub->left = target;
    target->parent = sub;
    
}

void rightRotate(tree_t* tree, node_t* target){
    
    node_t* sub =  tree->NIL;
    if(target == tree->root) return;
    if(!target || !tree) return;
    
    sub = target->left;
    target->left = sub->right;
    if(target->left != tree->NIL){
        target->left->parent = target;
    }
    sub->parent = target->parent;
    
    if(target->parent == tree->NIL){
        tree->root = sub;
    } else if(target->parent->left == target){
        target->parent->left = sub;
    } else {
        target->parent->right = sub;
    }
    
    target->parent = sub;
    sub ->right = target;
}


 // 새로운 노드를 삽입하는데, fix함수를 통해 레드블랙트리 조건을 만족하는지 확인한다.

void insertion(tree_t* tree, node_t* newNode){
    if(!tree || !newNode) return;
    newNode -> color = 1;//red
    node_t* tmp = tree->root;
    node_t* parent = tree->NIL;
    while(tmp != tree->NIL){
        parent = tmp;
        if(tmp->data < newNode->data){
            tmp = tmp->right;
        } else {
            tmp = tmp->left;
        }
    }
    newNode->parent = parent;
    if(parent == tree->NIL){
        tree->root = newNode;
    } else if(parent->data < newNode->data){
        parent->right = newNode;
    } else {
        parent->left = newNode;
    }
    newNode->left = tree->NIL;
    newNode->right = tree->NIL;
    
    insertionFix(tree, newNode);
    
}

//노드 삽입시 레드블랙트리 조건을 만족하는지 확인하는 함수
void insertionFix(tree_t* tree, node_t* insertNode){
    node_t* uncle = tree->NIL;
    if(tree->root == insertNode){
        insertNode->color = 0; //삽입된 노드가 루트인경우는 레드블랙트리의 특성상 블랙으로 설정
        return;
    }
    
    while(insertNode->parent->color == 1){
        //insertnode의 parent가 left인 경우
        if(insertNode->parent == insertNode->parent->parent->left){
            uncle = insertNode->parent->parent->right;
            
            if(uncle->color==1){
                //uncle이 red인경우 uncle과 parent의 색을 블랙으로
                uncle-> color = 0;
                insertNode->parent ->color = 0;
                //grandparent는 레드로 변경
                insertNode->parent->parent->color = 1;
                //삽입노드를 grandparent로,
                insertNode = insertNode->parent->parent;
            } else {
                //uncle이 블랙이고, 삽입노드의 위치가 오른쪽인 경우
                if(insertNode == insertNode->parent->right){
                    leftRotate(tree, insertNode->parent);
                    insertNode = insertNode->left;
                }
                //grandparent를 red로
                insertNode->parent->parent ->color = 1;
                //parent는 black으로
                insertNode->parent ->color = 0;
                //parent를 기준으로 right rotation
                rightRotate(tree, insertNode->parent->parent);
            }
        } else {
            //삽입노드의 parent가 right일경우 반대로 한다.
            uncle = insertNode->parent->parent->left;
            if(uncle->color==1){
                //uncle과 parent의 색을 블랙으로 변경
                uncle-> color = 0;
                insertNode->parent ->color = 0;
                //grandparent는 red로
                insertNode->parent->parent->color = 1;
                //삽입노드는 grandparent로
                insertNode = insertNode->parent->parent;
            } else {
                //uncle이 black이고, 삽입노드의 위치가 left인 경우
                if(insertNode == insertNode->parent->left){
                    rightRotate(tree, insertNode->parent);
                    //insertnode를 parent로 변경.
                    insertNode = insertNode->right;
                }
                //grandparent는 red로
                insertNode->parent->parent ->color = 1;
                //parentnode는 black으로
                insertNode->parent ->color = 0;
                //grandparent 기준으로 rotation
                leftRotate(tree, insertNode->parent->parent);
            }
        }
    }
    tree->root->color = 0;
}


// 노드를 삭제하고 그 위치에 노드를 삽입, 여기에 색상을 같이 고려해 준다.
 
void transplant(tree_t* tree, node_t* target, node_t* alter){
    if(!target || !alter) return;
    
    if(target->parent == tree->NIL){
        tree->root = alter;
        //타겟이 parent의 leftchild이면 왼쪽에 alter 삽입
    } else if(target->parent->left == target){
        target->parent->left = alter;
    } else {
        //타겟이 parent의 rightchild이면 오른쪽에 alter 삽입
        target->parent->right = alter;
    }
        //alter의 부모를 타겟의 부모로 설정
    alter->parent = target->parent;
    return;
}


//주어진 노드를 루트로 하는 서브트리에서 최소값을 찾는 함수
 
node_t * findMin(tree_t* tree, node_t* node){
    if(!node) return node;
    
    while(node->left != tree->NIL){
        node = node -> left;
    }
    return node;
}


//노드를 삭제하는 함수

void deletion(tree_t* tree, node_t* node){
    int originalColor = node-> color;
    node_t* successor = tree->NIL;
    node_t* fixupNode = tree->NIL;
    
    //node의 leftchild가 없거나, node가 존재하지 않을때
    if(node->left == tree->NIL){
        fixupNode = node->right;
        transplant(tree, node, node->right);
        //node의 rightchild가 없는 경우
    } else if(node->right == tree->NIL){
        fixupNode = node -> left;
        transplant(tree, node, node->left);
    } else {
        //node의 child가 2개인 경우
        successor = findMin(tree, node->right);
        fixupNode = successor->right;
        originalColor = successor -> color;
        //successsor의 parent가 삭제하려는 node인 경우
        if(successor->parent == node){
            fixupNode ->parent = successor;
        }else {
            transplant(tree, successor, successor->right);
            successor->right = node->right;
            successor->right-> parent = successor;
        }
        //노드 삭제 처리.
        transplant(tree, node, successor);
        successor->left = node->left;
        successor->left -> parent = successor;
        successor->color = node->color;
        
    }
    
    if(originalColor == 0){
        deleteFixup(tree, fixupNode);
    }
}

void deleteFixup(tree_t* tree, node_t* fixupNode){
    node_t* sibling = tree->NIL;
    
    while(fixupNode != tree->root && fixupNode->color == 0){
        if(fixupNode == fixupNode->parent->left){
            sibling= fixupNode->parent->right;
            //sibling이 red인 경우
            if(sibling->color == 1){
                //sibling을 black으로 변경
                sibling-> color = 0;
                //parent를 레드로 변경.
                fixupNode->parent->color = 1;
                //부모를 인자로 해서 좌로테이션.
                leftRotate(tree, fixupNode->parent);
                //sibling = 부모의 오른쪽에 있는 아이로.
                sibling = fixupNode->right;
            }
            //sibling의 left와 right가 모두 black인 경우
            if(sibling->left->color == 0 && sibling->right->color == 0){
                //sibling을 red로 변경
                sibling->color = 1;
                //fixupNode = parent
                fixupNode = fixupNode->parent;
            } else {
                //sibling의 right가 black인 경우
                if(sibling->right->color == 0){
                    
                    sibling->left->color = 0;
                    sibling->color = 1;
                    rightRotate(tree, sibling);
                    sibling = fixupNode->parent->right;
                }
                
                //아래부터는 sibling의 right child가 red인 경우
                sibling->color = fixupNode->parent->color;
                sibling->right->color = 0;
                sibling->parent->color = 0;
                leftRotate(tree, fixupNode->parent);
                fixupNode = tree->root;
                
            }
        } else {
            sibling= fixupNode->parent->left;
            //sibling이 red인 경우
            if(sibling->color == 1){
                //sibling을 black으로
                sibling-> color = 0;
                fixupNode->parent->color = 1;
                rightRotate(tree, fixupNode->parent);
                sibling = fixupNode->left;
            }
            //sibling의 left가 black이고 right도 black이면
            if(sibling->right->color == 0 && sibling->left->color == 0){
                sibling->color = 1;
                fixupNode = fixupNode->parent;
            } else {
                if(sibling->left->color == 0){
                    sibling->right->color = 0;
                    sibling->color = 1;
                    rightRotate(tree, sibling);
                    sibling = fixupNode->parent->right;
                }
                
                //아래는 sibling의 right가 red인 경우
                sibling->color = fixupNode->parent->color;
                sibling->right->color = 0;
                sibling->parent->color = 0;
                leftRotate(tree, fixupNode->parent);
                fixupNode = tree->root;
            }
        }
    }
    tree->root->color = 0;
}


//inorder로 출력하는 함수.
 
void inorderTraversal(tree_t* tree, node_t* node){
    if(!tree || !node){
        return;
    }
    if(node == tree->NIL){
        printf("NIL\n");
        return;
    }
    inorderTraversal(tree, node->left);
    printf("%d \n", node->data);
    inorderTraversal(tree, node->right);
}


//노드를 자동 생성 하는 함수
 

node_t* makeNode(tree_t* tree, int data){
    node_t* node = (node_t*)malloc(sizeof(node_t));
    node->data = data;
    node->color = 1;
    return node;
}


//블랙하이트가 체크하는 함수
 
int checkBlackHeight(tree_t* tree, node_t* node){
    int leftHeight, rightHeight;
    if(!tree) return -1;
    if(node == tree->NIL) return 0;
    
    
    leftHeight = checkBlackHeight(tree, node->left);
    rightHeight = checkBlackHeight(tree, node->right);
    
    if(leftHeight == -1 || rightHeight == -1)
        return -1;
    if(node->left->color == 0) leftHeight++;
    
    if(node->right->color == 0) rightHeight++;
    
    if(leftHeight == rightHeight){
        return leftHeight;
    }
    
    return -1;
    
    
}


// 만들어진 100개짜리 node_t배열을 셔플.
 
void shuffle(node_t** sampleArr){
    node_t* tmp = (node_t*) NULL;
    srand((unsigned int)time(NULL));
    int i, randomChoice;
    for(i = 0;i < MAX_NUM; i++){
        randomChoice = (rand() % (MAX_NUM - i))+ i;//에러 있었음.
        
        tmp = *(sampleArr+i);
        *(sampleArr+i)=  *(sampleArr+randomChoice);
        *(sampleArr+randomChoice) = tmp;
    }
    
}


// 예제로 사용할 100개 짜리 node_t* 배열에 노드를 생성해서 넣어두는 함수.
 
void makeArr(node_t** sampleArr, tree_t* tree){
    int i;
    for(i = 0; i < MAX_NUM; i++){
        *(sampleArr + i) = makeNode(tree, i);
    }
    return;
}


// 예제 100개를 자동 insertion하는 함수.
 
void nodeInsertion(tree_t* tree, node_t** sampleArr){
    int i, checkNum;
    for(i =0; i < MAX_NUM; i++){
        insertion(tree, *(sampleArr + i));
        checkNum = checkBlackHeight(tree, *(sampleArr+i));
        if(checkNum == -1){
            printf("node insertion error");
            return;
        }
    }
    return;
}


// 예제 100개를 자동 삭제 하는 함수
 
void nodeDeletion(tree_t* tree, node_t** sampleArr){
    int i, checkNum;
    for(i =0; i< MAX_NUM; i++){
        deletion(tree, *(sampleArr + i));
        checkNum = checkBlackHeight(tree, *(sampleArr + i));
        if(checkNum == -1){
            printf("node deletion error %d th", i);
            return;
        }
    }
}

int main(void){
    node_t* sampleArr[100];
    tree_t tree;
    node_t* NIL=(node_t*)malloc(sizeof(node_t));
    NIL->data = (int)NULL;
    NIL->color = 0;
    tree.NIL = NIL;
    tree.NIL->left = tree.NIL;
    tree.NIL->right = tree.NIL;
    tree.root = NIL;
    
    
    makeArr(sampleArr, &tree);
    shuffle(sampleArr);
    nodeInsertion(&tree, sampleArr);
    printf("insertion check complete");
    inorderTraversal(&tree, tree.root);
    nodeDeletion(&tree, sampleArr);
    inorderTraversal(&tree, tree.root);
    printf("print empty");
    
    return 0;
}