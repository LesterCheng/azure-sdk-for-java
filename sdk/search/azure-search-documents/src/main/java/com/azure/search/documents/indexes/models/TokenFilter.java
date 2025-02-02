// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.implementation.models.EdgeNGramTokenFilterV1;
import com.azure.search.documents.indexes.implementation.models.EdgeNGramTokenFilterV2;
import com.azure.search.documents.indexes.implementation.models.NGramTokenFilterV1;
import com.azure.search.documents.indexes.implementation.models.NGramTokenFilterV2;
import java.io.IOException;

/** Base type for token filters. */
@Immutable
public abstract class TokenFilter implements JsonSerializable<TokenFilter> {
    /*
     * The name of the token filter. It must only contain letters, digits, spaces, dashes or underscores, can only
     * start and end with alphanumeric characters, and is limited to 128 characters.
     */
    private final String name;

    /**
     * Creates an instance of TokenFilter class.
     *
     * @param name the name value to set.
     */
    public TokenFilter(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the token filter. It must only contain letters, digits, spaces, dashes or
     * underscores, can only start and end with alphanumeric characters, and is limited to 128 characters.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TokenFilter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the TokenFilter.
     */
    public static TokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    String discriminatorValue = null;
                    JsonReader readerToUse = null;

                    // Read the first field name and determine if it's the discriminator field.
                    reader.nextToken();
                    if ("@odata.type".equals(reader.getFieldName())) {
                        reader.nextToken();
                        discriminatorValue = reader.getString();
                        readerToUse = reader;
                    } else {
                        // If it isn't the discriminator field buffer the JSON to make it replayable and find the
                        // discriminator field value.
                        JsonReader replayReader = reader.bufferObject();
                        replayReader.nextToken(); // Prepare for reading
                        while (replayReader.nextToken() != JsonToken.END_OBJECT) {
                            String fieldName = replayReader.getFieldName();
                            replayReader.nextToken();
                            if ("@odata.type".equals(fieldName)) {
                                discriminatorValue = replayReader.getString();
                                break;
                            } else {
                                replayReader.skipChildren();
                            }
                        }

                        if (discriminatorValue != null) {
                            readerToUse = replayReader.reset();
                        }
                    }
                    // Use the discriminator value to determine which subtype should be deserialized.
                    if ("#Microsoft.Azure.Search.AsciiFoldingTokenFilter".equals(discriminatorValue)) {
                        return AsciiFoldingTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.CjkBigramTokenFilter".equals(discriminatorValue)) {
                        return CjkBigramTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.CommonGramTokenFilter".equals(discriminatorValue)) {
                        return CommonGramTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter".equals(discriminatorValue)) {
                        return DictionaryDecompounderTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.EdgeNGramTokenFilterV2".equals(discriminatorValue)) {
                        EdgeNGramTokenFilterV2 codegen = EdgeNGramTokenFilterV2.fromJson(readerToUse);
                        return (codegen == null) ? null : new EdgeNGramTokenFilter(codegen);
                    } else if ("#Microsoft.Azure.Search.ElisionTokenFilter".equals(discriminatorValue)) {
                        return ElisionTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.KeepTokenFilter".equals(discriminatorValue)) {
                        return KeepTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.KeywordMarkerTokenFilter".equals(discriminatorValue)) {
                        return KeywordMarkerTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.LengthTokenFilter".equals(discriminatorValue)) {
                        return LengthTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.LimitTokenFilter".equals(discriminatorValue)) {
                        return LimitTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.NGramTokenFilterV2".equals(discriminatorValue)) {
                        NGramTokenFilterV2 codegen = NGramTokenFilterV2.fromJson(readerToUse);
                        return (codegen == null) ? null : new NGramTokenFilter(codegen);
                    } else if ("#Microsoft.Azure.Search.PatternCaptureTokenFilter".equals(discriminatorValue)) {
                        return PatternCaptureTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.PatternReplaceTokenFilter".equals(discriminatorValue)) {
                        return PatternReplaceTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.PhoneticTokenFilter".equals(discriminatorValue)) {
                        return PhoneticTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.ShingleTokenFilter".equals(discriminatorValue)) {
                        return ShingleTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.SnowballTokenFilter".equals(discriminatorValue)) {
                        return SnowballTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.StemmerTokenFilter".equals(discriminatorValue)) {
                        return StemmerTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.StemmerOverrideTokenFilter".equals(discriminatorValue)) {
                        return StemmerOverrideTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.StopwordsTokenFilter".equals(discriminatorValue)) {
                        return StopwordsTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.SynonymTokenFilter".equals(discriminatorValue)) {
                        return SynonymTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.TruncateTokenFilter".equals(discriminatorValue)) {
                        return TruncateTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.UniqueTokenFilter".equals(discriminatorValue)) {
                        return UniqueTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.WordDelimiterTokenFilter".equals(discriminatorValue)) {
                        return WordDelimiterTokenFilter.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.EdgeNGramTokenFilter".equals(discriminatorValue)) {
                        EdgeNGramTokenFilterV1 codegen = EdgeNGramTokenFilterV1.fromJson(readerToUse);
                        return (codegen == null) ? null : new EdgeNGramTokenFilter(codegen);
                    } else if ("#Microsoft.Azure.Search.NGramTokenFilter".equals(discriminatorValue)) {
                        NGramTokenFilterV1 codegen = NGramTokenFilterV1.fromJson(readerToUse);
                        return (codegen == null) ? null : new NGramTokenFilter(codegen);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field '@odata.type' didn't match one of the expected values '#Microsoft.Azure.Search.AsciiFoldingTokenFilter', '#Microsoft.Azure.Search.CjkBigramTokenFilter', '#Microsoft.Azure.Search.CommonGramTokenFilter', '#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter', '#Microsoft.Azure.Search.EdgeNGramTokenFilterV2', '#Microsoft.Azure.Search.ElisionTokenFilter', '#Microsoft.Azure.Search.KeepTokenFilter', '#Microsoft.Azure.Search.KeywordMarkerTokenFilter', '#Microsoft.Azure.Search.LengthTokenFilter', '#Microsoft.Azure.Search.LimitTokenFilter', '#Microsoft.Azure.Search.NGramTokenFilterV2', '#Microsoft.Azure.Search.PatternCaptureTokenFilter', '#Microsoft.Azure.Search.PatternReplaceTokenFilter', '#Microsoft.Azure.Search.PhoneticTokenFilter', '#Microsoft.Azure.Search.ShingleTokenFilter', '#Microsoft.Azure.Search.SnowballTokenFilter', '#Microsoft.Azure.Search.StemmerTokenFilter', '#Microsoft.Azure.Search.StemmerOverrideTokenFilter', '#Microsoft.Azure.Search.StopwordsTokenFilter', '#Microsoft.Azure.Search.SynonymTokenFilter', '#Microsoft.Azure.Search.TruncateTokenFilter', '#Microsoft.Azure.Search.UniqueTokenFilter', '#Microsoft.Azure.Search.WordDelimiterTokenFilter', '#Microsoft.Azure.Search.EdgeNGramTokenFilter', or '#Microsoft.Azure.Search.NGramTokenFilter'. It was: '"
                                        + discriminatorValue
                                        + "'.");
                    }
                });
    }
}
