# Exercice 13:
_Auteure: Aimée BWEMBA_
On considère les classes suivantes: 


``` java
class C {
char ch = 'C';
char getCh() { return ch; }
}
class D extends C {
char ch = 'D';
char getCh() { return ch; }
}

```

Question : Qu’affiche le code Java suivant ?


``` java
C c = new C();
C cd = new D();
D d = new D();
System.out.println(c.ch);
System.out.println(c.getCh());
System.out.println(cd.ch);
System.out.println(cd.getCh());
System.out.println(d.ch);
System.out.println(d.getCh());

``` 


### Sortie :
```console
C
C
D
D
D
D
```
