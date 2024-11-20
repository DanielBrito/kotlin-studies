/*

application.yaml

segmentation:
  products:
    - TECHNOLOGY
    - BEAUTY
    - CLOTHING
    - SPORTS

*/

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

enum class ProductType(val value: String) {
    TECHNOLOGY("Technology"),
    BEAUTY("Beauty"),
    CLOTHING("Clothing"),
    SPORTS("Sports)    
}

@Component
@ConfigurationProperties(prefix = "segmentation")
class ProductApplication {
    final lateinit var products: List<ProductType>

    fun process(productType: ProductType) {
        if(products.contains(productType) {
            println("Product from $productType category is eligible for processing...")
        }
    }
}
