// Sets configuration for external services communication based on specific requirements

@Configuration
class RestClientConfiguration {

    @Bean
    fun restClient(builder: RestClient.Builder): RestClient = builder.build()
}

@Configuration
class JacksonConfiguration {

    @Bean
    fun jacksonCustomizer(): Jackson2ObjectMapperBuilderCustomizer =
        Jackson2ObjectMapperBuilderCustomizer { builder ->
            builder.featuresToEnable(SerializationFeature.INDENT_OUTPUT)
            builder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            builder.modulesToInstall(JavaTimeModule::class.java)
            builder.propertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
        }
}
