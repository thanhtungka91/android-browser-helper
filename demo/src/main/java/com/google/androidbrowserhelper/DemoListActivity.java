// Copyright 2019 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.androidbrowserhelper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.androidbrowserhelper.demo.R;
import com.google.androidbrowserhelper.launchtwa.LaunchTwaActivity;

import androidx.appcompat.app.AppCompatActivity;

public class DemoListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_list);
    }

    public void launchTwaDemos(View view) {
        startActivity(new Intent(this, LaunchTwaActivity.class));
    }
}
