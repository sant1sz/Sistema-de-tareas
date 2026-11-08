# ✅ Sistema de tareas

Gestor de tareas en Java que mantiene las tareas **siempre ordenadas por fecha de entrega y prioridad**, usando una **lista simplemente enlazada implementada desde cero**.

Proyecto del curso **Estructura de Datos** (Ingeniería de Sistemas, ITM), desarrollado en equipo con [Samuel Mejía](https://github.com/smejiadev05).

## ✨ Funcionalidades

- **Agregar tareas en orden:** cada tarea nueva se inserta directamente en su posición, primero por fecha de entrega y, si la fecha es igual, por prioridad (Urgente › Alta › Media › Baja). Así la lista nunca necesita reordenarse.
- **Buscar** una tarea por su título.
- **Marcar como completa:** la tarea cambia de estado y sale de la lista de pendientes.
- **Eliminar** una tarea en cualquier posición (inicio, medio o final).
- **Mostrar** todas las tareas pendientes en orden.

## 🧱 Estructura de datos

`ListaSimple<T>` es una lista simplemente enlazada genérica con referencias a `head` y `tail`:

| Operación | Complejidad |
|---|---|
| `addFirst`, `addLast`, `removeFirst` | O(1) |
| `removeLast` | O(n) |
| Insertar tarea en orden | O(n) |
| Buscar o eliminar por título | O(n) |

## 📂 Clases

| Clase | Responsabilidad |
|---|---|
| `Nodo<T>` | Nodo con el dato y la referencia al siguiente |
| `ListaSimple<T>` | Lista simplemente enlazada genérica |
| `Tarea` | Título, descripción, fecha de entrega, prioridad y estado |
| `Prioridad` | Nombre y valor numérico de la prioridad |
| `SistemaTareas` | Inserción ordenada, búsqueda, eliminación y listado |
| `Main` | Ejemplo de uso con tareas de prueba |

## ▶️ Cómo ejecutarlo

Requiere Java 17 o superior.

```bash
javac -d out src/*.java
java -cp out Main
```
