int matrix1[R][C];
for(int i=0;i<R;i++){
    for (int j=0;j<C;j++){
        matrix1[i][j]=matrix[R-i-1][j];
    }
}
for (int i=0;i<R;i++){
    for (int j=0;j<C;j++){
        matrix[i][j]=matrix1[i][j];
    }
}
