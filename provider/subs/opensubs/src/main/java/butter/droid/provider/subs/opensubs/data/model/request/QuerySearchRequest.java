/*
 * This file is part of Butter.
 *
 * Butter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Butter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Butter. If not, see <http://www.gnu.org/licenses/>.
 */

package butter.droid.provider.subs.opensubs.data.model.request;

import io.reactivex.annotations.Nullable;

public class QuerySearchRequest {

    public static final String LANGUAGE_ALL = "all";

    @Nullable public final String query;
    @Nullable public final String sublanguageid;

    public QuerySearchRequest(final String query, final String language) {
        this.query = query;
        this.sublanguageid = language;
    }
}

