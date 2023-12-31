#include<stdio.h>
//Matrix Calcutor

//Function for Matrix input.
void matrixInput(int row,int col,int matrix[row][col])
{
        for(int i=0;i<row;i++)
    {
        for (int j=0;j<col;j++)
        {
            printf("Enter element of (%d , %d):",i+1,j+1);
            scanf("%d",&matrix[i][j]);
            
        }    
    }
    printMatrix(row,col,matrix);
}

//Function for printing the matrix
void printMatrix(int row,int col,int matrix[row][col])
{
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            printf("%d  ",matrix[i][j]);
        }
        printf("\n");
    }
}

//Function for Addition
void addMatrix(int row,int col,int matrix1[row][col],int matrix2[row][col],int sum[row][col])
{
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<row;j++)
        {
            sum[i][j]=matrix1[i][j]+matrix2[i][j];
        }
    }
    printf("Additon of two Matrix:\n");
    printMatrix(row,col,sum);
}


//Function for Subtraction
void subMatrix(int row,int col,int matrix1[row][col],int matrix2[row][col],int sum[row][col])
{
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<row;j++)
        {
            sum[i][j]=matrix1[i][j]-matrix2[i][j];
        }
    }
    printf("Subtraction of two matrix:\n");
    printMatrix(row,col,sum);
}

// Function to multiply two matrices
void multiplication(int row1, int col1, int col2, int matrix1[row1][col1], int matrix2[col1][col2], int result[row1][col2]) {
    for (int i = 0; i < row1; i++) 
    {
        for (int j = 0; j < col2; j++) 
        {
            result[i][j] = 0;
            for (int k = 0; k < col1; k++)
            {
                result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }
    printf("Multiplication of two Matrix:\n");
    printMatrix(row1,col2,result);
}

//Transpose of single Matrix
void transpose(int row, int col, int matrix[row][col], int result[col][row]) 
{
    for (int i = 0; i < row; i++) 
    {
        for (int j = 0; j < col; j++)
        {
            result[j][i] = matrix[i][j];
        }
    }
    printf("Transpose of a Matrix:\n");
    printMatrix(col,row,result);
}
//Determinant of square matrix
int determinant(int row , int col ,int matrix[row][col], int det) 
{
    if ( row == 1)
    {
        return matrix[0][0];
    }

    if (row == 2) 
    {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    det = 0;

    for (int i = 0; i < row; ++i)
    {
        // Create a submatrix excluding the current row and column
        int submatrix[row - 1][col - 1];
        int sub_i = 0, sub_j = 0;
        for (int row1 = 1; row1 < row; ++row1)
        {
            for (int col1 = 0; col1 < col; ++col1)
            {
                if (col1 != i)
                {
                    submatrix[sub_i][sub_j++] = matrix[row1][col1];
                    if (sub_j == row - 1)
                    {
                        sub_j = 0;
                        sub_i++;
                    }
                }
            }
        }
    
        // Calculate the cofactor and add to the determinant
        det += (i % 2 == 0 ? 1 : -1) * matrix[0][i] * determinant(row-1,col-1,submatrix, row - 1);
    }
    return det;
}


// Function to calculate the adjoint of a square matrix
void adjoint(int row, int col, int matrix[row][col], int result[row][col])
{
    int size = row;
    for (int i = 0; i < size; ++i)
    {
        for (int j = 0; j < size; ++j)
        {
            // Create a submatrix excluding the current row and column
            int submatrix[row - 1][col - 1];
            int sub_i = 0, sub_j = 0;
            for (int row1 = 0; row1 < size; ++row1)
            {
                for (int col1 = 0; col1 < size; ++col1)
                {
                    if (row1 != i && col1 != j)
                    {
                        submatrix[sub_i][sub_j++] = matrix[row1][col1];
                        if (sub_j == size - 1)
                        {
                            sub_j = 0;
                            sub_i++;
                        }
                    }
                }
            }

            // Calculate the cofactor and transpose to get the adjoint
            result[j][i] = ((i + j) % 2 == 0 ? 1 : -1) * determinant(row - 1, col - 1, submatrix, size - 1);
        }
    }
    printf("Adjoint of Matrix:\n");
    printMatrix(row, col, result);
}

//Inverse of matrix
void inverse(int row,int col,int matrix[row][col])
{
    int size=row;
    int det=determinant(row,col,matrix,size);
    int result[row][col];
    adjoint(row,col,matrix,result);
    printf("Inverse of a Matrix:\n");
     for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            printf("%d/%d  ",result[i][j],det);
        }
        printf("\n");
    }
}


// Function to check whether a matrix is an identity matrix
void isIdentityMatrix(int row,int col,int matrix[row][col]) 
{
    for (int i = 0; i < row; ++i)
    {
        for (int j = 0; j < col; ++j)
        {
            // Diagonal elements should be 1, and non-diagonal elements should be 0
            if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                printf("Not an identity matrix\n");
            }
        }
    }
    printf("It is an identity matrix\n");
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
    int choice;
    printf("Enter your choice:");
    scanf("%d",&choice);
    if(choice==1){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat1[row][col];
        int mat2[row][col];
        int sum[row][col];
        printf("Enter elements of matrix 1 :\n");
        matrixInput(row,col,mat1);
        printf("Enter elements of matrix 2 :\n");
        matrixInput(row,col,mat2);
        addMatrix(row,col,mat1,mat2,sum);      
    }
    else if(choice==2){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat1[row][col];
        int mat2[row][col];
        int sub[row][col];
        printf("Enter elements of matrix 1 :\n");
        matrixInput(row,col,mat1);
        printf("Enter elements of matrix 2 :\n");
        matrixInput(row,col,mat2);
        subMatrix(row,col,mat1,mat2,sub);      
    }
    else if(choice==3){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat1[row][col];
        int mat2[row][col];
        int mul[row][col];
        printf("Enter elements of matrix 1 :\n");
        matrixInput(row,col,mat1);
        printf("Enter elements of matrix 2 :\n");
        matrixInput(row,col,mat2);
        multiplication(row,col,col,mat1,mat2,mul);      
    }
    else if(choice==4){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat1[row][col];
        int mat2[row][col];
        int result[row][col];
        printf("Enter elements of matrix 1 :\n");
        matrixInput(row,col,mat1);
        printf("Enter elements of matrix 2 :\n");
        matrixInput(row,col,mat2);
        addMatrix(row,col,mat1,mat2,result);      
        subMatrix(row,col,mat1,mat2,result);      
        multiplication(row,col,col,mat1,mat2,result);      
    }
    else if(choice==5){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat[row][col];
        int result[row][col];
        printf("Enter elements of matrix:\n");
        matrixInput(row,col,mat);
        transpose(row,col,mat,result);            
    }
    else if(choice==6){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat[row][col];
        int result[row][col];
        printf("Enter elements of matrix:\n");
        matrixInput(row,col,mat);
        adjoint(row,col,mat,result);            
    }
    else if(choice==7){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat[row][col];
        int det;
        printf("Enter elements of matrix:\n");
        matrixInput(row,col,mat);
        printf("Deteminant of matrix:\n");
        printf("%d",determinant(row,col,mat,det));
    }
    else if(choice==8){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat[row][col];
        printf("Enter elements of matrix:\n");
        matrixInput(row,col,mat);
        inverse(row,col,mat);
    }
    else if(choice==9){
        int row,col;
        printf("Enter number of rows:");
        scanf("%d",&row);
        printf("Enter number of col:");
        scanf("%d",&col);
        int mat[row][col];
        printf("Enter elements of matrix:\n");
        matrixInput(row,col,mat);
        isIdentityMatrix(row,col,mat);
        }
    else{
        printf("invalid choice:\n");
    }
    return 0;
}