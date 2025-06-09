### 🧠 Goal:

To check whether all the brackets (round `()`, curly `{}`, and square `[]`) in a string:

1. Open and close properly
2. Are **in the correct order**
3. Are **properly nested**

---

### 👨‍🏫 Step-by-Step Explanation:
> reference: [youtube_link](https://www.youtube.com/watch?v=CNOoP25NpfQ&list=PLQ7ZAf76c0ZPLXXfyu8U_plhGMrKYBR8K&index=2&ab_channel=shashCode)
1. **Check if the length of the string is odd**:

    * A valid pair of brackets always needs two characters.
    * So if the string has an odd number of characters (e.g., `"{[]"`), it can **never** be balanced.
    * **Example**: `"({"` has 2 opening brackets, no closing — invalid.

2. **Create a Stack**:

    * Think of a **stack** like a pile of plates.
    * You **push** plates (brackets) onto the pile when you see opening brackets.
    * You **pop** the top plate off the pile when you see a matching closing bracket.

3. **Loop through each character** in the string:

    * If it's an opening bracket (`(`, `[`, `{`), push it on the stack.
    * If it's a closing bracket:

        * Check if the stack is empty. If yes → return `false` (closing without opening).
        * Otherwise, check if it matches the top bracket on the stack.

            * If it matches → pop the top (we closed a valid pair).
            * If it doesn't match → return `false` (wrong closing).

4. **Final check after the loop**:

    * If the stack is empty, that means all opening brackets had matching closing brackets → return `true`.
    * If the stack still has items, it means some brackets were never closed → return `false`.

---