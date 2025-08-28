//Admin (id, name, salary, allowance) using structure.
#include <stdio.h>
#include <string.h>
struct Admin {
    int id;
    char name[20];
    float salary;
    float allowance;
};

void main() {
    struct Admin a1, a2;
    a1.id = 101;
    strcpy(a1.name, "Janvi");
    a1.salary = 90000.0;
    a1.allowance = 5500.0;
    
    printf("Enter the details of Admin 2:\n");

    printf("Enter ID: ");
    scanf("%d", &a2.id);

    printf("Enter Name: ");
    scanf("%s", a2.name);

    printf("Enter Salary: ");
    scanf("%f", &a2.salary);

    printf("Enter Allowance: ");
    scanf("%f", &a2.allowance);

    printf("ID        = %d\n", a1.id);
    printf("Name      = %s\n", a1.name);
    printf("Salary    = %.2f\n", a1.salary);
    printf("Allowance = %.2f\n", a1.allowance);

    printf("ID        = %d\n", a2.id);
    printf("Name      = %s\n", a2.name);
    printf("Salary    = %.2f\n", a2.salary);
    printf("Allowance = %.2f\n", a2.allowance);

    
}
