# Práctica CSS: «La Taberna de Marta»
**Duración:** 3 horas · **Entrega:** `estilo.css` (carpeta comprimida con `img/` si has añadido algo)

## Enunciado
Dar estilo a la web de un restaurante (`index.html` y `carta.html`) trabajando **solo en `estilo.css`**. Ambas páginas comparten la misma hoja.

## Reglas
- **No puedes modificar los HTML** (ni usar `style` en línea ni `<style>`).
- Sin `!important`. Solo lo visto en clase (sin flexbox, grid, `position`, `float` ni pseudoclases).
- Una declaración por línea, con indentación, y comenta cada parte.
- Prueba siempre las **dos páginas** en el navegador (F12 para inspeccionar).
- Necesitas conexión: la tipografía *Playfair Display* se carga desde Google Fonts (ya está enlazada).

## Parte 1 · Base, herencia y cascada 
1. Reset con el selector universal (margin y padding a 0).
2. `body`: `font-family` con al menos 3 fuentes y una genérica al final; `font-size` en `pt`; `line-height`; `color` de texto (los hijos deben heredarlo).
3. Agrupa `h1, h2, h3` en una sola regla con `font-family: 'Playfair Display'` y `serif` como alternativa.
4. Usa, al menos una vez cada uno: color por **nombre**, **hexadecimal**, **hsl()** y uno **con transparencia** (rgba/hsla).

## Parte 2 · Tipografía 
5. `h1`: 36pt, `font-variant: small-caps`, `letter-spacing` y `text-shadow`.
6. `.lema`: cursiva, `text-transform: capitalize` y `word-spacing`.
7. Enlaces de `nav`: sin subrayado, negrita, color claro.
8. `.precio`: negrita, cursiva, color destacado y `white-space: nowrap`.
9. Títulos `h2`: tamaño y color propios.

## Parte 3 · Selectores 
Usa **todos** estos tipos (indica con un comentario cuál es cada uno):
10. Id: `#pie`. 11. Clase: `.nota`. 12. Elemento+clase: `p.descripcion`. 13. Dos clases: `.plato.destacado`.
14. Descendiente: `main section p` → párrafos justificados, con `text-indent: 1.5em`.
15. Hijo: `section > h2`.
16. Hermano adyacente: `h2 + p` → primer párrafo tras cada título en 13pt y negrita.
17. Hermano general: `.plato ~ .plato` → separación superior de 20px.
18. Los `p.descripcion` no deben llevar sangría ni justificado (resuélvelo con **especificidad**, no con `!important`).

## Parte 4 · Modelo de cajas 
19. `#contenedor`: ancho 90% con `max-width: 900px`, **centrado** con `margin`, borde de 1px, borde superior de 6px y `box-shadow`.
20. `#cabecera` y `main` con `padding` (usa la forma abreviada de 2 o 4 valores al menos una vez).
21. `section > h2`: solo borde inferior (punteado) y margen propio.
22. `.plato`: `padding`, `margin`, borde con **lado izquierdo distinto** y `border-radius`.
23. `.nota`: borde discontinuo + `outline` doble con `outline-offset`.
24. `#pie`: usa `border-top: inherit` para repetir el borde de su contenedor.

## Parte 5 · Fondos 
25. `body`: imagen `img/patron.svg` repetida y `background-attachment: fixed`.
26. `#cabecera`: `img/cabecera.svg` sin repetir y centrada (`background-position`).
27. `#contenedor`: fondo semitransparente para que se vea el patrón.

## Parte 6 · Tablas 
28. `.carta`: `border-collapse: collapse`, `table-layout: fixed`, ancho 100%, bordes en celdas, cabecera (`th`) con fondo y texto contrastados.
29. `.carta .precio`: ancho fijo y alineado a la derecha; filas `.alt` con otro fondo; `.vegano` con otro color.
30. `.horario`: `border-collapse: separate`, `border-spacing` y `empty-cells`. Prueba `show` y `hide` y deja el que se vea mejor.

## Parte 7 · Cascada 
31. En la `index.html` el párrafo `<p class="nota" id="aviso">` debe verse en **burdeos**. Escribe en el CSS tres reglas con colores distintos (`p`, `.nota`, `#aviso`) y comenta cuál se aplica y por qué.

## Rúbrica (10 puntos)
| Criterio | Puntos |
|---|---|
| Tipografía (partes 1-2) | 2 |
| Selectores y especificidad (partes 3 y 7) | 2 |
| Modelo de cajas (parte 4) | 2 |
| Fondos (parte 5) | 1 |
| Tablas (parte 6) | 1,5 |
| Código limpio: indentación, comentarios, sin repeticiones, sin `!important` ni estilos en línea | 1 |
| Resultado visual coherente y legible (contraste, espaciado) en ambas páginas | 0,5 |
