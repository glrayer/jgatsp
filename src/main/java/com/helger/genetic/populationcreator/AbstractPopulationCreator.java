/**
 * Copyright (C) 2012-2014 Philip Helger
 * ph[at]phloc[dot]com
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
package com.helger.genetic.populationcreator;

import javax.annotation.Nonnull;

import com.helger.genetic.IPopulationCreator;
import com.helger.genetic.model.IMutablePopulation;
import com.helger.genetic.model.Population;

public abstract class AbstractPopulationCreator implements IPopulationCreator
{
  private long m_nGeneration = 0;

  @Nonnull
  public final IMutablePopulation createEmptyPopulation ()
  {
    return new Population (m_nGeneration++);
  }
}
