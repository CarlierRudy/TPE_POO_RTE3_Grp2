// Auteur : Daguebaa Josué

// EXERCICE 7
// Dans la classe Rectangle
@Override
public boolean equals(Object objet) {
    if (!(objet instanceof Rectangle)) return false;
    Rectangle autre = (Rectangle) objet;
    return this.position.equals(autre.position) 
        && this.largeur == autre.largeur 
        && this.hauteur == autre.hauteur;
}

// Dans la classe SlantedRectangle
@Override
public boolean equals(Object objet) {
    if (!(objet instanceof SlantedRectangle)) return false;
    SlantedRectangle autre = (SlantedRectangle) objet;
    return super.equals(objet) && this.angle == autre.angle;
}