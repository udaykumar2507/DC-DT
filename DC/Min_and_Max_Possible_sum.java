class HelloWorld {
    public static void main(String[] args) {
        int x=645;
        int y=656;
        int min=x+y;
        int max=x+y;
        int p=1;
        while(x+y>0){
            min-=((x%10==6?1:0)+(y%10==6?1:0))*p;
            max+=((x%10==5?1:0)+(y%10==5?1:0))*p;
            x/=10; y/=10;p*=10;
        }
        System.out.println(min);
        System.out.print(max);
    }
}
