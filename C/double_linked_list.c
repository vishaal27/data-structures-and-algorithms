#include <stdio.h>
#include <stdlib.h>

// Double Linked List for Integer declaration
struct Node{
  int data;
  struct Node *prev;
  struct Node *next;
};

// HACK Add documentation

void traverse(struct Node *head){
  if(!head){
    printf("Cannot traverse empty List\n");
    return;
  }
  struct Node *temp = head;
  while (temp) {
    printf("%d\n", temp->data);
    temp = temp->next;
  }
}

int length(struct Node *head){
  if(!head){
    return 0;
  }
  int count = 0;
  struct Node *temp = head;
  do {
    count++;
    temp = temp->next;
  } while(temp);
  return count;
}

struct Node* newNode(int val){
  struct Node *n = (struct Node*) malloc(sizeof(struct Node));
  if(!n){
    printf("Unable to allocate memory\n");
    return NULL;
  }
  n->data = val;
  n->next = NULL;
  n->prev = NULL;
  return n;
}

struct Node* push(struct Node **head,int val){
  struct Node *n = newNode(val);
  struct Node *temp = *head;
  n->next = temp;
  if(temp)
    temp->prev = n;
  *head = n;
  return n;
}

struct Node* append(struct Node **head,int val){
  struct Node *n = newNode(val);
  struct Node *temp = *head;
  while (temp->next) {
    temp = temp->next;
  }
  n->next = temp->next;
  n->prev = temp;
  temp->next = n;
  return n;
}

struct Node* insertAt(struct Node **head,int val,int position){
  int len = length(*head);
  if(!*head){
    return NULL;
  }
  if(position == 0){
    return push(head,val);
  }
  if(position >= len -1){
    return append(head,val);
  }
  int aux = 0;
  struct Node* n = newNode(val);
  struct Node* temp = *head;
  while (aux < position && temp->next) {
    temp = temp->next;
    aux++;
  }
  n->next = temp;
  n->prev = temp->prev;
  if(temp->prev){
    temp->prev->next = n;
  }
  temp->prev = n;
  return n;
}

int pop(struct Node **head){
  int val;
  struct Node *temp = *head;
  if(!temp){
    return -1;
  }
  // HACK : pop when there is one element in the list
  while (temp->next) {
    temp = temp->next;
  }
  val = temp->data;
  if(temp->prev){
    temp->prev->next = temp->next;
    free(temp);
  }
  return val;
}

//HACK : Change method name
int pull(struct Node **head){
  if(! (*head)){
    return -1;
  }
  struct Node *temp = *head;
  int val = temp->data;
  *head = (*head)->next;
  if(*head)
    (*head)->prev = NULL;
  free(temp);
  return val;
}

int removeAt(struct Node **head,int position){
  int len = length(*head);
  if(len <= position){
    printf("position not present\n");
    return -1;
  }
  if(position == 0){
    return pull(head);
  }
  if(position == length(*head) - 1){
    return pop(head);
  }
  struct Node *temp = *head;
  int aux = 0,val;
  while ((aux < position) && temp->next) {
    temp = temp->next;
    aux++;
  }
  val = temp->data;
  temp->prev->next = temp->next;
  if(temp->next){
    temp->next->prev = temp->prev;
  }
  free(temp);
  return val;
}

int main(int argc, char const *argv[]) {
  // HACK : Include or Remove test cases
  // struct Node *head = newNode(2);
  // push(&head,1);
  // push(&head,0);
  // append(&head,4);
  // // removeAt(&head,1);
  // insertAt(&head,999,1);
  // insertAt(&head,99,99);
  // traverse(head);
  // printf("List Length : %d\n",length(head));
  return 0;
}
