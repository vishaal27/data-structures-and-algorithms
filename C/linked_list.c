#include <stdio.h>
#include <stdlib.h>
// Linked List or Single Linked List for Integer declaration
struct Node {
  // element at present node
  int data;
  // pointer to next node
  struct Node *next;
};

// Main Operation on Linked List are
// Inserting, Deleting and Traversing

struct Node* newNode(int val){
  struct Node *n = (struct Node *)malloc(sizeof(struct Node));
  // if memory is not allocated to new node the return NULL alerting the user
  if(!n)
  {
    printf("Unable to allocate memory for node\n");
    return NULL;
  }
  // assign the data to node
  n->data = val;
  // point the next pointer to NULL
  n->next = NULL;

  return n;
}

// Traverse the Linked List
void traverse(struct Node *head){
  // create a temporary pointer to store current head pointer
  // it the current node
  struct Node *temp = head;
  // current node is not null
  while (temp) {
    // prinnt data at current node
    printf("%d\n",temp->data);
    // move to next node
    temp = temp->next;
  }
}

// recursive method to traverse the linked list
void recursiveTravese(struct Node *head) {
  struct Node *temp = head;
  if(!temp){
    free(temp);
    return ;
  }
  printf("%d\n", temp->data);
  recursiveTravese(temp->next);
}

// method to find the length of the linked list
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

// method to insert node at the beginning of the linked list. Also called as push
// returns pointer of newly inserted node
struct Node* push(struct Node **head,int val){
  struct Node *temp = *head;
  struct Node *n = newNode(val);
  if(!n){
    printf("Unable to allocate memory\n");
    return NULL;
  }
  // update newly created node's next pointer to current head
  n->next = temp;
  // update the head to newly created node
  *head = n;
  return n;
}

// instert node at the end of the linked list
struct Node* append(struct Node **head, int val){
  struct Node *temp = *head;
  struct Node *n = newNode(val);
  if(!n){
    printf("Unable to allocate memory\n");
    return NULL;
  }
  // traverse upto the last node
  while (temp->next) {
    temp = temp->next;
  }
  // update last node next pointer to newly created node
  temp->next = n;
  return n;
}

// method to insert node at specified position starting from index 0
// is position is not present, it append node to end of the list
struct Node* insertAt(struct Node **head,int val,int position){
  int aux = 0;
  struct Node *n = newNode(val);
  if(!n){
    printf("Unable to allocate memory\n");
    return NULL;
  }
  if(position == 0){
    return push(head,val);
  }
  struct Node *prev,*current = *head;
  while (current && (aux < position)) {
    /* code */
    prev = current;
    current = current->next;
    aux++;
  }
  prev->next = n;
  n->next = current;
  return n;
}

// remove node form the end of linked list
int pop(struct Node **head){
  // variable to store the returning value
  int val;
  // Two pointers to track current node and previous node to current node
  struct Node *prev,*current = *head;
  if(!current->next){
    val = current->data;
    free(current);
    return val;
  }
  // traverse until the last node
  while (current->next) {
    prev = current;
    current = current->next;
  }
  // store the data at current node
  val = current->data;
  // update prev node next pointer to current node next pointer
  prev->next = current->next;
  // free current node from the memory
  free(current);
  return val;
}

// HACK : Change the method name
// removes node from beginning of the linked list
int pull(struct Node **head){
  int val;
  struct Node *temp = *head;
  // update current head to it next node
  val = temp->data;
  *head = temp->next;
  free(temp);
  return val;
}

// removes node at specified position
int removeAt(struct Node **head, int position){
  // if specified position is greater than length of the list
  // allert user and return -1
  int len = length(*head);
  if(position >= len){
    printf("position not present\n");
    return -1;
  }
  if(position == 0){
    return pull(head);
  }
  if(position == len -1){
    return pop(head);
  }
  int aux = 0,val;
  struct Node *prev,*current = *head;
  while (current && (aux < position)) {
    prev = current;
    current = current->next;
    aux++;
  }
  val = current->data;
  prev->next = current->next;
  free(current);
  return val;
}

// driver function
int main(int argc, char const *argv[]) {
  // HACK : To include test case or not.
  // struct Node *head = newNode(5);
  // push(&head,4);
  // push(&head,3);
  // push(&head,2);
  // push(&head,1);
  // traverse(head);
  // printf("Appending 6\n");
  // append(&head,6);
  // traverse(head);
  // printf("Poping %d\n", pop(&head));
  // traverse(head);
  // printf("Pulling %d\n", pull(&head));
  // traverse(head);
  // printf("Inserting at position 2\n");
  // insertAt(&head,99,2);
  // traverse(head);
  // printf("List length is %d\n", length(head));
  // printf("Removing at position 6 : %d\n",removeAt(&head,0));
  // traverse(head);
  return 0;
}
