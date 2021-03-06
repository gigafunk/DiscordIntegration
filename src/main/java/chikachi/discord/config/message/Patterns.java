/**
 * Copyright (C) 2016 Chikachi
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses.
 */

package chikachi.discord.config.message;

import java.util.regex.Pattern;

class Patterns {
    static final Pattern everyonePattern = Pattern.compile("(^|\\W)@everyone\\b");
    static final Pattern boldPattern = Pattern.compile("\\*\\*(.*)\\*\\*");
    static final Pattern italicPattern = Pattern.compile("\\*(.*)\\*");
    static final Pattern italicMePattern = Pattern.compile("\\*(.*)\\*");
    static final Pattern underlinePattern = Pattern.compile("__(.*)__");
    static final Pattern lineThroughPattern = Pattern.compile("~~(.*)~~");
    static final Pattern singleCodePattern = Pattern.compile("`(.*)`");
    static final Pattern multiCodePattern = Pattern.compile("```(.*)```");
    static final Pattern customFormattingPattern = Pattern.compile("&([0-9a-fA-F])");
}
