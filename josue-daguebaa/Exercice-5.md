# Exercice 5 :
_Auteur: DAGUEBAA Josué_
### Énoncé : Est-ce que la classe `Dessin` définie précédemment peut contenir des rectangle inclinés ? Est-ce que les méthodes `surface()`, `contains()` et `hull()` de la classe Dessin fonctionnent encore correctement ?

# Correction Exercice 5 
Oui, la classe Dessin définie précédemment peut contenir des rectangle inclinés car `SlantedRectangle` est une classe fille de `Rectangle`.

### Problèmes :
- `surface()` : La méthode fonctionne correctement car la surface ne dépend pas de l’angle ;
- `contains()` : Elle est correcte car elle n'est pas non redéfinie dans la classe `SlantedRectangle` ;
- `hull()`: La méthode fonctionne incorrectement car le rectangle englobant doit être recalculé en tenant compte des inclinaisons.
