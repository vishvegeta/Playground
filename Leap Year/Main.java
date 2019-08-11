#include<stdio.h>
int main()
{
  long int year;
  scanf("%ld",&year);
  if(year<0){
    printf("No");}
  else if(year!=0 && year%100 == 0 && year%400==0){
    printf("LEAP YEAR\n");}
  else if(year!=0 && year%100 == 0 && year%400!=0){
    printf("NOT LEAP YEAR\n");}
  else if(year%100 != 0 && year%400!=0){
    if(year%4==0){
      printf("LEAP YEAR\n");}
    else{
      printf("NOT LEAP YEAR\n");}
  }
  return 0;
}