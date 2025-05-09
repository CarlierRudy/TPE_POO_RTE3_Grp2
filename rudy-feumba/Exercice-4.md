# Correction Exercice 3

# Analyse des appels de méthodes

Nous avons les déclarations suivantes :

Point p = new Point(1, 2);
Rectangle r = new Rectangle(p, 2, 3);
Rectangle t = new SlantedRectangle(p, 2, 3);
SlantedRectangle s = new SlantedRectangle(p, 2, 3);

On souhaite analyser ligne par ligne les appels de méthodes suivants, pour savoir :
S'ils se compilent correctement & Quell méthode est effectivement appelée à l'exécution.

- `System.out.println(r.surface());`       //  Compile -> Fais appel à la méthode `Rectangle.surface()` de la classe Rectangle.
- `r.rotate(2); `                        //  Ne compile pas -> Car fais appel à la méthode `Rectangle.rotate(int)` pourtant la méthode `rotate()` n'existe pas dans la classe Rectangle.
- `System.out.println(r.contains(p));` //  Compile -> Fais appel à la méthode `Rectangle.contains(Point)`

- `System.out.println(t.surface());`     //  Compile -> Fais appel à la méthode `Rectangle.surface()` hérité par `SlantedRectangle` car `surface()` n'a pas été redéfinie dans la classe SlantedRectangle.
- `t.rotate(2);`                        //  Ne compile pas -> Car fais appel à la methode `Rectangle.rotate(int)` pourtant la méthode `rotate()` n'existe pas dans la classe Rectangle.
- `System.out.println(t.contains(p));`   //  Compile -> Fais appel à la methode Rectangle.contains(Point)  hérité par `SlantedRectangle` car `contains()` n'a pas été redéfinie dans la classe SlantedRectangle.

- `System.out.println(s.surface());`    //  Compile -> Fais appel à la méthode `Rectangle.surface()` hérité par `SlantedRectangle` car `surface()` n'a pas été redéfinie dans la classe SlantedRectangle.
- `s.rotate(2);`                        //  Compile -> Fais appel à la méthode `SlantedRectangle.rotate(int)` définit dans la classe SlantedRectangle.
- `System.out.println(s.contains(p));`  //  Compile -> Fais appel à la methode Rectangle.contains(Point)  hérité par `SlantedRectangle` car `contains()` n'a pas été redéfinie dans la classe SlantedRectangle.
