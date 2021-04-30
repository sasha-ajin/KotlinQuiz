package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "How to define the variable x ,which is equals to 1in Kotlin?",
            R.drawable.firstq,
            "val x: Int = 1", "x=1",
            "int x=1", "int x", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which is NOT kotlin data type?",
                R.drawable.two2,
            "Double", "Float",
            "True", "Boolean", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "How to set condition NOT equal to?",
            R.drawable.three3,
            "=", "!=",
            "=!", "==", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is the right condition?",
            R.drawable.four4,
            "a=1", "a==2",
            "b*c", "a=b", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "How to print \"Hello World!\"?",
            R.drawable.five5,
            "print(\"Hello World! \")", "cout«'Hello World!';",
            "console.log('Hello World!')", "console.print('Hello World!')", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is the right function definition?",
            R.drawable.six6,
            "fun sum(a: Int, b: Int) = a + b ", "func add(x int, y int) int{x+y}",
            "def fun(a,b){a+b}", "static int sum(a,b){a+b}", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "How to write comment?",
            R.drawable.seven7,
            "// This is an end-of-line comment", "# This is an end-of-line comment",
            "& This is an end-of-line comment", "comment=This is an end-of-line comment", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "How should look for loop up?",
            R.drawable.eight8,
            "for (item in items) { println(item) }", "for item in items: println(item)",
            "for (item in items)  : println(item)", "for {item in items} : ( println(item) )", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "How should look while loop up?",
            R.drawable.nine9,
            "while {index < items.size} : index++", "while (index < items.size) {index++}",
            "while {index < items.size} (index++)", "while (index < items.size): {index++}", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "How to define the  array named \"numbers\" with int el?",
            R.drawable.ten10,
            "val numbers: Array<Int>", "val numbers: Array(Int)",
            "val numbers{ Array<Int>}", "val numbers: Array{Int}", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}
