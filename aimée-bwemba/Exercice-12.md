# Exercice 12:
_Auteure: Aimée BWEMBA_
### Enoncé :
Dans la classe Rectangle a été définie une méthode boolean `contains(Rectangle)`. Cette
méthode doit-elle être redéfinie dans la classe SlantedRectangle ? Quels cas ne sont pas
couverts par cette redéfinition ? On ajoute alors une méthode boolean
`contains(SlantedRectangle)` dans les classes Rectangle et SlantedRectangle. Quels
cas ne sont toujours pas couverts par ces ajouts ?
La méthode `contains(Rectangle)` doit-elle être redéfinie dans SlantedRectangle ?
Quels cas restent non couverts ?

# Solution

Non, la redefinition n'est pas nécessaire car un SlantedRectangle (incliné) a une même logique que celle de Rectangle.
Cas non couverts si on ajoute contains(SlantedRectangle) :

- Un Rectangle standard ne peut pas contenir un SlantedRectangle (même si géométriquement possible).

- Un SlantedRectangle ne peut pas contenir un Rectangle standard si l’angle n’est pas nul.
