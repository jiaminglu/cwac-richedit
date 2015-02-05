/***
 Copyright (c) 2008-2015 CommonsWare, LLC

 Licensed under the Apache License, Version 2.0 (the "License"); you may
 not use this file except in compliance with the License. You may obtain
 a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.commonsware.cwac.richedit;

import android.text.Spannable;
import android.text.style.ForegroundColorSpan;

public class ForegroundColorEffect extends AbstractColorEffect<ForegroundColorSpan> {
  @Override
  ForegroundColorSpan[] getColorSpans(Spannable str, Selection selection) {
    return(str.getSpans(selection.start, selection.end,
                        ForegroundColorSpan.class));
  }

  @Override
  int getColorForSpan(ForegroundColorSpan span) {
    return(span.getForegroundColor());
  }

  @Override
  ForegroundColorSpan buildColorSpan(Integer value) {
    return(new ForegroundColorSpan(value));
  }
}
