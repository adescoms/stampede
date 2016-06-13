/*
 * This file is part of ToroDB.
 *
 * ToroDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ToroDB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with core. If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2016 8Kdata.
 *
 */
package com.torodb.core.d2r;

import java.util.Collection;

import javax.annotation.Nonnull;

import com.torodb.kvdocument.values.KVDocument;

/**
 *
 */
public interface R2DTranslator {

    /**
     * Translates from relational model to the document model the given doc part results.
     * <p>
     * Return a collection that contains the translation of all doc part results that have been translated.
     * <p>
     *
     * @param docPartResults the doc part results that must be translated
     */
    @Nonnull
    public Collection<KVDocument> translate(@Nonnull DocPartResults docPartResults);

}
