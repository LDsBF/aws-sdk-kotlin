// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Describes the serialization format of the object.
 */
class InputSerialization private constructor(builder: Builder) {
    /**
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value:
     * NONE.
     */
    val compressionType: aws.sdk.kotlin.services.s3.model.CompressionType? = builder.compressionType
    /**
     * Describes the serialization of a CSV-encoded object.
     */
    val csv: aws.sdk.kotlin.services.s3.model.CsvInput? = builder.csv
    /**
     * Specifies JSON as object's input serialization format.
     */
    val json: aws.sdk.kotlin.services.s3.model.JsonInput? = builder.json
    /**
     * Specifies Parquet as object's input serialization format.
     */
    val parquet: aws.sdk.kotlin.services.s3.model.ParquetInput? = builder.parquet

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.InputSerialization = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InputSerialization(")
        append("compressionType=$compressionType,")
        append("csv=$csv,")
        append("json=$json,")
        append("parquet=$parquet)")
    }

    override fun hashCode(): kotlin.Int {
        var result = compressionType?.hashCode() ?: 0
        result = 31 * result + (csv?.hashCode() ?: 0)
        result = 31 * result + (json?.hashCode() ?: 0)
        result = 31 * result + (parquet?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InputSerialization

        if (compressionType != other.compressionType) return false
        if (csv != other.csv) return false
        if (json != other.json) return false
        if (parquet != other.parquet) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.InputSerialization = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value:
         * NONE.
         */
        var compressionType: aws.sdk.kotlin.services.s3.model.CompressionType? = null
        /**
         * Describes the serialization of a CSV-encoded object.
         */
        var csv: aws.sdk.kotlin.services.s3.model.CsvInput? = null
        /**
         * Specifies JSON as object's input serialization format.
         */
        var json: aws.sdk.kotlin.services.s3.model.JsonInput? = null
        /**
         * Specifies Parquet as object's input serialization format.
         */
        var parquet: aws.sdk.kotlin.services.s3.model.ParquetInput? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.InputSerialization) : this() {
            this.compressionType = x.compressionType
            this.csv = x.csv
            this.json = x.json
            this.parquet = x.parquet
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.InputSerialization = InputSerialization(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.CsvInput] inside the given [block]
         */
        fun csv(block: aws.sdk.kotlin.services.s3.model.CsvInput.Builder.() -> kotlin.Unit) {
            this.csv = aws.sdk.kotlin.services.s3.model.CsvInput.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.JsonInput] inside the given [block]
         */
        fun json(block: aws.sdk.kotlin.services.s3.model.JsonInput.Builder.() -> kotlin.Unit) {
            this.json = aws.sdk.kotlin.services.s3.model.JsonInput.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ParquetInput] inside the given [block]
         */
        fun parquet(block: aws.sdk.kotlin.services.s3.model.ParquetInput.Builder.() -> kotlin.Unit) {
            this.parquet = aws.sdk.kotlin.services.s3.model.ParquetInput.invoke(block)
        }
    }
}
