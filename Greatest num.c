int main() {
    int a = 15, b = 25, c = 50;  

    if (a > b) {
        if (a > c) {
            printf("Greatest number %d", a);
        } else {
            printf("Greatest number  %d", c);
        }
    } else {
        if (b > c) {
            printf("Greatest number  %d", b);
        } else {
            printf("Greatest number %d", c);
        }
    }

    
}
