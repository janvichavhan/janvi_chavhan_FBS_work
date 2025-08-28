//SalesManager (id, name, salary, incentive, target) using Structure
#include <stdio.h>
#include <string.h>
struct SalesManager {
    int id;
    char name[20];
    float salary;
    float incentive;
    int target;
};

void main() {
    struct SalesManager sm1, sm2;
    
    sm1.id = 101;
    strcpy(sm1.name, "Janvi");
    sm1.salary = 60000.0;
    sm1.incentive = 8000.0;
    sm1.target = 50;

    
    printf("Enter the details of Sales Manager 2:\n");

    printf("Enter ID: ");
    scanf("%d", &sm2.id);

    printf("Enter Name: ");
    scanf("%s", sm2.name);

    printf("Enter Salary: ");
    scanf("%f", &sm2.salary);

    printf("Enter Incentive: ");
    scanf("%f", &sm2.incentive);

    printf("Enter Target: ");
    scanf("%d", &sm2.target);

    printf("ID        = %d\n", sm1.id);
    printf("Name      = %s\n", sm1.name);
    printf("Salary    = %.2f\n", sm1.salary);
    printf("Incentive = %.2f\n", sm1.incentive);
    printf("Target    = %d\n", sm1.target);

    printf("ID        = %d\n", sm2.id);
    printf("Name      = %s\n", sm2.name);
    printf("Salary    = %.2f\n", sm2.salary);
    printf("Incentive = %.2f\n", sm2.incentive);
    printf("Target    = %d\n", sm2.target);

}
