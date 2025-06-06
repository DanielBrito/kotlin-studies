package list1

fun main() {
    val numberOfGrades = 3

    val grades = mutableListOf<Double>()
    val weights = mutableListOf<Double>()

    for(i in 1 .. numberOfGrades) {
        print("Enter grade #$i: ")
        val grade = readLine()?.toDoubleOrNull() ?: return println("Invalid grade")
        print("Enter weight for grade #$i: ")
        val weight = readLine()?.toDoubleOrNull() ?: return println("Invalid weight")

        grades.add(grade)
        weights.add(weight)
    }

    val weightedSum = grades.zip(weights).sumOf { (g, w) -> g * w }
    val totalWeight = weights.sum()

    val weightedAverage = weightedSum / totalWeight

    println("Weighted Average: $weightedAverage")
}
