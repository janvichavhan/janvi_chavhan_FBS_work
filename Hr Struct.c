//HR (id, name, salary, commission)
#include <stdio.h>
#include <string.h>

struct HR {
    int id;
    char name[20];
    float salary;
    float commission;
};

void main() {
    struct HR h1, h2;
    h1.id = 1;
    strcpy(h1.name, "Janvi");
    h1.salary = 50000.0;
    h1.commission = 7000.0;
    
    printf("Enter the details of HR 2:\n");

    printf("Enter ID: ");
    scanf("%d", &h2.id);

    printf("Enter Name: ");
    scanf("%s", h2.name);

    printf("Enter Salary: ");
    scanf("%f", &h2.salary);

    printf("Enter Commission: ");
    scanf("%f", &h2.commission);

    printf("ID          = %d\n", h1.id);
    printf("Name        = %s\n", h1.name);
    printf("Salary      = %.2f\n", h1.salary);
    printf("Commission  = %.2f\n", h1.commission);
    
    printf("ID          = %d\n", h2.id);
    printf("Name        = %s\n", h2.name);
    printf("Salary      = %.2f\n", h2.salary);
    printf("Commission  = %.2f\n", h2.commission);


}
