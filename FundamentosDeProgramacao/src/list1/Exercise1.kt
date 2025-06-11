package list1

fun main() {
    val numberOfGrades = 3

    val grades = DoubleArray(numberOfGrades)
    val weights = DoubleArray(numberOfGrades)

    for(i in 0 until numberOfGrades) {
        print("Enter grade #${i+1}: ")
        val grade = readLine()?.toDoubleOrNull() ?: return println("Invalid grade")

        print("Enter weight for grade #${i+1}: ")
        val weight = readLine()?.toDoubleOrNull() ?: return println("Invalid weight")

        grades[i] = grade
        weights[i] = weight
    }

    val weightedSum = grades.zip(weights).sumOf { (g, w) -> g * w }
    val totalWeight = weights.sum()

    val weightedAverage = weightedSum / totalWeight

    println("Weighted Average: $weightedAverage")
}
