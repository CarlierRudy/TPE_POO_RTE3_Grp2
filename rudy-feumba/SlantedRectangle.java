// Auteur : Rudy Carlier Feumba
// Solution Exercice 1,2 & 3 - TD Programmation Orientée Objet

public class SlantedRectangle extends Rectangle {
    private double angleOrigRect = 0; // Angle en degré formé par le côté inférieur horizontal (passant par point le
                                      // bas et gauche) du rectangle et de l'horizontale (Axe des abscisses)
    private Point OrigHautRect;

    public SlantedRectangle(Point pointO, Point pointB, double angleIncl) {
        super(pointO, pointB);
        this.angleOrigRect = angleIncl;
    }

    public SlantedRectangle(Point pointO, double Longueur, double hauteur, double angleIncl) {
        super(pointO, Longueur, hauteur);
        this.angleOrigRect = angleIncl;
    }

    public SlantedRectangle(double x, double y, double L, double l, double angleIncl) {
        super(x, y, L, l);
        this.angleOrigRect = angleIncl;
    }

    void rotate(double angleIncl) {
        this.angleOrigRect = this.angleOrigRect + angleIncl;
    }

    @Override
    void hull(Rectangle[] rectTab) {
        if (rectTab == null || rectTab.length == 0) {
            System.out.println("Empty Table");
            return;
        }

        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = Double.MIN_VALUE;
        double maxY = Double.MIN_VALUE;

        for (Rectangle r : rectTab) {
            if (!(r instanceof SlantedRectangle))
                continue;

            SlantedRectangle sr = (SlantedRectangle) r;

            // Coordonnées du coin supérieur gauche
            double x0 = sr.OrigRect.getAbs();
            double y0 = sr.OrigRect.getOrd();
            double l = sr.Long;
            double h = sr.haut;
            double theta = sr.getAngle();

            // Calcul des 4 coins après rotation
            double[][] corners = new double[4][2];

            // Vecteurs de base tournés
            double cos = Math.cos(theta);
            double sin = Math.sin(theta);

            // Point 0 : origine
            corners[0][0] = x0;
            corners[0][1] = y0;

            // Point 1 : origine + longueur
            corners[1][0] = x0 + l * cos;
            corners[1][1] = y0 + l * sin;

            // Point 2 : origine + hauteur (à 90° de l'angle)
            corners[2][0] = x0 - h * sin;
            corners[2][1] = y0 + h * cos;

            // Point 3 : point1 + vecteur hauteur
            corners[3][0] = corners[1][0] - h * sin;
            corners[3][1] = corners[1][1] + h * cos;

            // Mise à jour des min/max
            for (int i = 0; i < 4; i++) {
                double cx = corners[i][0];
                double cy = corners[i][1];
                minX = Math.min(minX, cx);
                minY = Math.min(minY, cy);
                maxX = Math.max(maxX, cx);
                maxY = Math.max(maxY, cy);
            }
        }

        double newLong = maxX - minX;
        double newHaut = maxY - minY;

        SlantedRectangle boundingRect = new SlantedRectangle(minX, minY, newLong, newHaut, 0); // sans inclinaison

        System.out.println("Le plus petit rectangle englobant est : Origine ("
                + boundingRect.OrigRect.getAbs() + ", " + boundingRect.OrigRect.getOrd() + ")");
        System.out.println("Longueur : " + boundingRect.Long + " ; Hauteur : " + boundingRect.haut);
    }

}