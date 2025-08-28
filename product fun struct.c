#include <stdio.h>
#include <string.h>
struct product {
    int id;
    char name[20];
    int quantity;
    float price;
};

void displayProduct(struct product p);
struct product storeProduct();

void main() {
    struct product p1, p2, p3;

    printf("\nEnter details of Product 1:\n");
    p1 = storeProduct();

    printf("\nEnter details of Product 2:\n");
    p2 = storeProduct();

    printf("\nEnter details of Product 3:\n");
    p3 = storeProduct();

    printf("\nEntered details of Products are:\n");
    displayProduct(p1);
    displayProduct(p2);
    displayProduct(p3);

}

void displayProduct(struct product p) {
    printf("ID       = %d\n", p.id);
    printf("Name     = %s\n", p.name);
    printf("Quantity = %d\n", p.quantity);
    printf("Price    = %.2f\n\n", p.price);
}

struct product storeProduct() {
    struct product temp;
    scanf("%d", &temp.id);
    scanf("%s", temp.name);
    scanf("%d", &temp.quantity);
    scanf("%f", &temp.price);

    return temp;
}
