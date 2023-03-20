<template>

    <v-card outlined>
        <v-card-title>
            View # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="Filesize" v-model="item.filesize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Filename" v-model="item.filename" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isindexed" v-model="item.isindexed" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isupload" v-model="item.isupload" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Videourl" v-model="item.videourl" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ViewViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/views/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

