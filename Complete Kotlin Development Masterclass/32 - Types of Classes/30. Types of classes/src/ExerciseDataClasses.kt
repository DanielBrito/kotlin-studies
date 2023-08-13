import kotlin.random.Random

fun main(args: Array<String>) {
    val articles = arrayListOf<Article>()

    for (i in 1..10) {
        articles.add(getArticle())
    }

    val newArticles = arrayListOf<Article>()

    for (article in articles) {

        newArticles.add(article)
        
        val newArticle = article.copy(
                title = article.title + " for my blog"
            )
        
        newArticles.add(newArticle)
    }

    newArticles.forEach { println(it) }
}

fun getArticle(): Article {
    val randomTitle = "Title " + Random.nextInt(100)
    val numberOfReaders = Random.nextInt(1000)
    
    return Article(randomTitle, "Some content", numberOfReaders)
}

data class Article(
    val title: String,
    val content: String,
    val numberOfReaders: Int
)