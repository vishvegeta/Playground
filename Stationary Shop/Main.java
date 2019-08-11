#include<stdio.h>
int main()
{
  int stock,price,req;
  char item[50];
  scanf("%s%d%d%d",&item,&stock,&price,&req);
  if(stock<req){
    printf("Out of stock");
  }
  else if (stock>req){
    printf("The amount for %d %s is %d\n",req,item,price*req);
    printf("Remaining number of %ss present in the stock: %d",item,stock-req);
  }
  return 0;
  
  }