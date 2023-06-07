#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Fonction de comparaison pour le tri des mots avec un ordre spécifié
int comparer(const void *a, const void *b) {
  const char *s1 = *(const char **)a;
  const char *s2 = *(const char **)b;

  // Ordre spécifié pour le tri, à modifier ici :
  char ordre[] = "ctexamplsrd";

  // Itération sur les caractères des mots
  size_t len1 = strlen(s1);
  size_t len2 = strlen(s2);

  // On vérifie la longueur minimale entre les deux mots
  size_t minLength = len1 < len2 ? len1 : len2;

  for (size_t i = 0; i < minLength; i++) {
    char c1 = s1[i];
    char c2 = s2[i];

    // Recherche des indices des caractères dans l'ordre spécifié
    char *index1 = strchr(ordre, c1);
    char *index2 = strchr(ordre, c2);

    if (index1 != NULL && index2 != NULL) {
      // Comparaison des indices pour le tri
      return index1 - index2;
    }
  }

  // Comparaison des longueurs des mots pour le tri
  return len1 - len2;
}