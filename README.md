# Repositorio CarlChokSanc

> Developer

> Designer

> Gamer

**Proyecto de CIFRAS SIGNIFICATIVAS**

- Realizado en Java
- Modo formulario

![imagen cifras significativas](https://www.learningaboutelectronics.com/imagenes/Cifras-significativas.png)

## Ejemplo (Funcionamiento)

```java
// code away!

private void jtxtNumeroKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        //formula para ingresar numeros y una coma
        char[] p = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};
        int b = 0;
        for (int i = 0; i <= 10; i++) {
            if (p[i] == evt.getKeyChar()) {
                b = 1;
            }

        }
        if (b == 0) {
            evt.consume();
            getToolkit().beep();
        }
    }
```

---

> void main

```shell
 public static void main(String[] args) {
        Sentecias s = new Sentecias();
        s.formula("2.360");
        if (s.formula("0") == 3) {
            System.out.println("correcto");
        } else {
           System.out.println("incorrecto");
       }

    }
```

> method formula

```shell
char[] vector = new char[numero.length()];
        int c = 0;
        int v = 0;
        int g = 0;
        int b = 0;
        for (int i = 0; i < numero.length(); i++) {
            vector[i] = numero.charAt(i);
        }
```

---


## Copyright by:


- **[Carlos Choca Sánchez](https://twitter.com/CarlChokSanc)**
- Copyright 2020 © <a href="https://twitter.com/CarlChokSanc" target="_blank">CarlChokSanc</a>
