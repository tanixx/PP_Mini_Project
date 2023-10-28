#include<stdio.h>
//Matrix Calcutor

//Function for Matrix input.
void matrixInput(int row,int col, int matrix[row][col])
{
        for(int i = 1; i<=row ;i++)
    {
        for (int j = 1; i <=col; j++)
        {
            printf("Enter element of (%d , %d):",i,j);
            scanf("%d",&matrix[row][col]);
            
        }    
    }
    printMatrix(row,col,matrix[row][col]);

}

//Function for printing the matrix
void printMatrix(int row,int col,int matrix[row][col])
{
    for(int i = 1;i <= row ;i++)
    {
        for(int j=1;i <=col ;j++)
        {
            printf("%d  ",matrix[i][j]);
        }
        printf("\n");
    }
}
//Function for Addition
void addMatrix(int row,int col,int matrix1[row][col],int matrix2[row][col],int sum[row][col])
{
    for(int i=0;i<=row;i++)
    {
        for(int j=0;j<=row;j++)
        {
            sum[i][j]=matrix1[i][j]+matrix2[i][j];
        }
    }
    printMatrix(row,col,sum[row][col]);
}


int main()
{
    //Displaying the main menu..
    printf("--------------------Matrix Calculator------------------\n");
    printf("\n");
    printf("-------------------------------------------------------\n");
    printf("1.Additon of two Matrix\n");
    printf("-------------------------------------------------------\n");
    printf("2.Subtraction of two Matrix\n");
    printf("-------------------------------------------------------\n");
    printf("3.Multiplication of two Matrix\n");
    printf("-------------------------------------------------------\n");
    printf("4.All above two matrix operation\n");
    printf("-------------------------------------------------------\n");
    printf("5.Transpose of one matrix \n");
    printf("-------------------------------------------------------\n");
    printf("6.Abjoint of a matrix\n");
    printf("-------------------------------------------------------\n");
    printf("7.Determinant of a matrix\n");
    printf("-------------------------------------------------------\n");
    printf("8.Inverse of a matrix\n");
    printf("-------------------------------------------------------\n");
    printf("9.Check for Identity Matrix\n");
    printf("-------------------------------------------------------\n");
    printf("10.All above Single Matrix operation\n");
    printf("-------------------------------------------------------\n");
    printf("Enter your choice:");
    int choice;
    scanf("%d",&choice);
    return 0;
}