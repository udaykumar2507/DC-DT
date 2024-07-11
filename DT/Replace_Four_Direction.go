package main
import "fmt"
func main() {
    var n,m int;
    fmt.Scan(&n,&m);
    arr:=make([][] string,n)
    for i:= range arr{
        arr[i]=make([] string,m)
    }
    for i:=0;i<n;i++ {
        for j:=0;j<m;j++ {
            fmt.Scan(&arr[i][j]);
        }
    }  
    var m1 string;
    fmt.Scan(&m1);
    i1,j1 :=-1,-1;
    for i:=0;i<n;i++ {
        for j:=0;j<m;j++{
            if arr[i][j]==m1 {
                i1,j1=i,j;
                break;
            }
        }
    }
    var i,j int;
    i=i1;
    j=j1;
    for (i>=0 && j>=0){
        arr[i][j]="*";
        i--;
        j--;
    }
    i=i1;
    j=j1;
    for (i>=0 && j<m){
        arr[i][j]="*";
        i--;
        j++;
    }
    i=i1;
    j=j1;
    for (i<n &&j>=0){
        arr[i][j]="*";
        i++;
        j--;
    }
    i=i1
    j=j1;
    for (i<n && j<m){
        arr[i][j]="*"
        i++
        j++
    }
    for i:=0;i<n;i++ {
        for j:=0;j<m;j++{
            fmt.Printf("%s ",arr[i][j]);
        }
        fmt.Println();
    }
}
