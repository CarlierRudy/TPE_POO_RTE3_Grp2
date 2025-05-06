# Correction Exercice 3
Enoncé : De quelles méthodes hérite la classe SlantedRectangle ? Redéfinir celles qui le nécessitent.

# Solution :
Les méthodes héritées de la classe Rectangle par la classe SlantedRectangle sont :
- `surface()` : qui calcule la surface du rectangle.
- `contains(Point)` : qui vérifie si un point est contenu dans le rectangle.
- `contains(Rectangle)` : qui vérifie si un rectangle est contenu dans le rectangle.
-`sameAs(Rectangle)` : qui vérifie si deux rectangles sont identiques.

La méthode à redéfinir dans la classe SlantedRectangle est la méthode `hull()`.
(Voir code source fichier `SlantedRectangle.java`).