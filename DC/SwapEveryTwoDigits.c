char str[20];
sprintf(str,"%d",num);
for (int i=0; str[i]&& str[i+1];i+=2){
     char temp=str[i];
     str[i]=str[i+1];
     str[i+1]=temp;
}
return atoi(str);
