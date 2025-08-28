#include <stdio.h>
#include <string.h>
struct admin {
    int id;
    char name[20];
    float salary;
    float allowance;
};
void displayAdmin(struct admin a);
struct admin storeAdmin();

void  main() {
    struct admin a1, a2, a3;

    printf("\nEnter details of admin 1:\n");
    a1 = storeAdmin();

    printf("\nEnter details of admin 2:\n");
    a2 = storeAdmin();

    printf("\nEnter details of admin 3:\n");
    a3 = storeAdmin();

    printf("\nEntered details of admins are:\n");
    displayAdmin(a1);
    displayAdmin(a2);
    displayAdmin(a3);
}
void displayAdmin(struct admin a) {
    printf("ID        = %d\n", a.id);
    printf("Name      = %s\n", a.name);
    printf("Salary    = %.2f\n", a.salary);
    printf("Allowance = %.2f\n\n", a.allowance);
}
struct admin storeAdmin() {
    struct admin temp;
    scanf("%d", &temp.id);
    scanf("%s", temp.name);
    scanf("%f", &temp.salary);
    scanf("%f", &temp.allowance);

    return temp;
}
