#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
!d
*/
int a(const void *x, const void *xx) {
    const char *a = *(const char **)x;
                    const char *b = *(const char **)xx;

    char s[] = "ctexamplsrd";

    size_t c1 = strlen(a); size_t c2 = strlen(b);

    size_t s1 = 
    c1 < 
    c2 
    ? 
    c1 : 
    c2;

    for (
        size_t j = 0; j < s1; j++
        ) 
        { char x = a[j]; char y = b[j];

        char *z1 = strchr(s, x);
        char *z2 = strchr(s, y);
    // ##
        if (z1 
        != NULL && z2 != NULL) {
        
            if (z1 > z2) {
                return z1 - z2;
            }
            
            
    //////////////////////        
            
            
            
            }
}

    return c1 - c2;
}
