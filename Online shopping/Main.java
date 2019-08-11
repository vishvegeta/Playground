#include<stdio.h>
int main()
{
  int p1,d1,s1,p2,d2,s2,p3,d3,s3;
  scanf("%d%d%d%d%d%d%d%d%d",&p1,&d1,&s1,&p2,&d2,&s2,&p3,&d3,&s3);
  int t1,t2,t3;
  t1=p1-(((p1*d1)/100))+s1;
  t2=p2-(((p2*d2)/100))+s2;
  t3=p3-(((p3*d3)/100))+s3;
  printf("In Flipkart: Rs.%d\n",t1);
  printf("In Snapdeal: Rs.%d\n",t2);
  printf("In Amazon: Rs.%d\n",t3);
  if(t1<t2&&t1<t3){
    printf("He will prefer Flipkart");}
  else if(t2<t1&&t2<t3){
    printf("He will prefer Snapdeal");}
  else{
    printf("He will prefer Amazon");}
  return 0;
}