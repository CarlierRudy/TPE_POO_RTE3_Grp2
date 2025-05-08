# Exercice 6 : (Suite)
_Auteur: DAGUEBAA Josué_
#### Énoncé : Définir une méthode String `toString()` dans la classe `Rectangle`. 
Est-ce en fait une définition ou une redéfinition ? 
Est-il nécessaire de la redéfinir dans la classe SlantedRectangle ? 

# Solution

``` java
// Dans la classe Rectangle
@Override
public String toString() {
    return "Rectangle [position=" + position + ", largeur=" + largeur + ", hauteur=" + hauteur + "]";
}
```

- C’est en fait une définition ;
- Oui, il est nécessaire de la redéfinir dans dans la classe `SlantedRectangle` pour inclure l’angle d'inclinaison.

