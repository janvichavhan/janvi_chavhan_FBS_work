//Employee (id, name, salary) using structure.
#include<stdio.h>
#include<string.h>
struct Employee {
    int id;
    char name[10];
    float salary;
};
void main() {
    struct Employee e1, e2;
    e1.id = 13;
    strcpy(e1.name, "Janvi");
    e1.salary = 55000.0;

    printf("Enter the details of Employee 2:\n");

    printf("Enter ID: ");
    scanf("%d", &e2.id);

    printf("Enter Name: ");
    scanf("%s", e2.name);

    printf("Enter Salary: ");
    scanf("%f", &e2.salary);
    
    printf("ID = %d\n", e1.id);
    printf("Name    = %s\n", e1.name);
    printf("Salary   = %f\n", e1.salary);

    printf("ID = %d\n", e2.id);
    printf("Name    = %s\n", e2.name);
    printf("Salary  = %f\n", e2.salary);


}
