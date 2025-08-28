#include <stdio.h>
#include <string.h>
struct salesManager {
    int id;
    char name[20];
    float salary;
    float incentive;
    int target;
};
void displaySalesManager(struct salesManager sm);
struct salesManager storeSalesManager();

void main() {
    struct salesManager sm1, sm2, sm3;

    printf("\nEnter details of Sales Manager 1:\n");
    sm1 = storeSalesManager();

    printf("\nEnter details of Sales Manager 2:\n");
    sm2 = storeSalesManager();

    printf("\nEnter details of Sales Manager 3:\n");
    sm3 = storeSalesManager();

    printf("\nEntered details of Sales Managers are:\n");
    displaySalesManager(sm1);
    displaySalesManager(sm2);
    displaySalesManager(sm3);
}

void displaySalesManager(struct salesManager sm) {
    printf("ID        = %d\n", sm.id);
    printf("Name      = %s\n", sm.name);
    printf("Salary    = %.2f\n", sm.salary);
    printf("Incentive = %.2f\n", sm.incentive);
    printf("Target    = %d\n\n", sm.target);
}

struct salesManager storeSalesManager() {
    struct salesManager temp;
    scanf("%d", &temp.id);
    scanf("%s", temp.name);
    scanf("%f", &temp.salary);
    scanf("%f", &temp.incentive);
    scanf("%d", &temp.target);

    return temp;
}
