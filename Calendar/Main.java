#include<stdio.h>
int main()
{
  int month,year;
  scanf("%d%d",&month,&year);
  switch(month)
  {
    case 1: printf("Number of days is 31");
      break;
    case 2: {
      if(year%4==0){
        printf("Number of days is 29");}
      else{
        printf("Number of days is 28");}
      break;}
    case 3: printf("Number of days is 31");
      break;
    case 4: printf("Number of days is 30");
      break;
	case 5: printf("Number of days is 31");
      break;
    case 6: printf("Number of days is 30");
      break;
	case 7: printf("Number of days is 31");
      break;
	case 8: printf("Number of days is 31");
      break;
  	case 9: printf("Number of days is 30");
      break;
  	case 10: printf("Number of days is 31");
      break;
  	case 11: printf("Number of days is 30");
      break;
  	case 12: printf("Number of days is 31");
      break;
  }
  return 0;
}