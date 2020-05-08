package hw5.task2;

public enum Letters {
    A, a, B, b, C, c, D, d, E, e, F, f, G, g, H, h, I, i, J, j, K, k, L, l, M, m, N, n, O, o, P, p, Q, q, R, r, S, s, T, t, U, u, V, v, W, w, X, x, Y, y, Z, z;

    public void getLetterPosition() {
        // Метод для выведения в консоль отдельной буквы и ее порядкового номера
        System.out.println(this + " - " + (this.ordinal() / 2 + 1));
    }

    public static void printAll() {
        // Метод для выведения в консоль всего алфавита с указание порядкового номера буквы
        System.out.println("\nAll letters:");
        Letters[] letters = values();
        for (int i = 0; i < letters.length; i++) {
            if (i % 2 == 0) {
                System.out.print(letters[i] + ", ");
            } else {
                System.out.println(letters[i] + " - " + (i / 2 + 1));
            }
        }
    }
}
