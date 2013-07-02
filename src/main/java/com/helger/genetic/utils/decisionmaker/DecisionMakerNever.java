/**
 * Copyright (C) 2006-2013 phloc systems
 * http://www.phloc.com
 * office[at]phloc[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.genetic.utils.decisionmaker;

import javax.annotation.Nonnull;

public final class DecisionMakerNever implements IDecisionMaker
{
  private static final DecisionMakerNever s_aInstance = new DecisionMakerNever ();

  private DecisionMakerNever ()
  {}

  @Nonnull
  public static DecisionMakerNever getInstance ()
  {
    return s_aInstance;
  }

  public boolean shouldDoIt ()
  {
    return false;
  }
}
