#include <stdio.h>
#include <string.h>
struct hr {
    int id;
    char name[20];
    float salary;
    float commission;
};
void displayHR(struct hr h);
struct hr storeHR();

void main() {
    struct hr h1, h2, h3;

    printf("\nEnter details of HR 1:\n");
    h1 = storeHR();

    printf("\nEnter details of HR 2:\n");
    h2 = storeHR();

    printf("\nEnter details of HR 3:\n");
    h3 = storeHR();

    printf("\nEntered details of HR employees are:\n");
    displayHR(h1);
    displayHR(h2);
    displayHR(h3);
}
void displayHR(struct hr h) {
    printf("ID         = %d\n", h.id);
    printf("Name       = %s\n", h.name);
    printf("Salary     = %.2f\n", h.salary);
    printf("Commission = %.2f\n\n", h.commission);
}
struct hr storeHR() {
    struct hr temp;
    scanf("%d", &temp.id);
    scanf("%s", temp.name);
    scanf("%f", &temp.salary);
    scanf("%f", &temp.commission);

    return temp;
}
