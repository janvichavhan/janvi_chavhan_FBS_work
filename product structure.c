//Product (id, name, quantity, price) using structure.
#include <stdio.h>
#include <string.h>
struct Product {
    int id;
    char name[20];
    int quantity;
    float price;
};

void main() {
    struct Product p1, p2;
    p1.id = 101;
    strcpy(p1.name, "Laptop");
    p1.quantity = 5;
    p1.price = 55000.50;

    printf("Enter details of Product 2:\n");
    printf("Enter ID: ");
    scanf("%d", &p2.id);

    printf("Enter Name: ");
    scanf("%s", p2.name);

    printf("Enter Quantity: ");
    scanf("%d", &p2.quantity);

    printf("Enter Price: ");
    scanf("%f", &p2.price);

    printf("ID       = %d\n", p1.id);
    printf("Name     = %s\n", p1.name);
    printf("Quantity = %d\n", p1.quantity);
    printf("Price    = %.2f\n", p1.price);
    
    printf("ID       = %d\n", p2.id);
    printf("Name     = %s\n", p2.name);
    printf("Quantity = %d\n", p2.quantity);
    printf("Price    = %.2f\n", p2.price);

}
